package edu.lu.uni.serval.idempotent.comm

import redis.clients.jedis.Jedis

/**
  * Created by darkrsw on 2016/December/05.
  */
object IdempotentRedisOps
{
  var host = "localhost"
  var jedis: Jedis = _

  def init(hosturl: String, passwd: String) =
  {
    host = hosturl
    jedis = new Jedis(host)
    jedis.connect()
    jedis.auth(passwd)
  }

  def setAlreadyProcessed(key: String) =
  {
    jedis.synchronized {
      jedis.set(key, "DONE")
    }
  }

  def checkAlreadyProcessed(key: String): Boolean =
  {
    jedis.synchronized {
      val value = jedis.get(key)

      if (value == null)
        return false
      else if (value == "DONE")
        return true
      else {
        // Unexpected value!
        Console.println("Unknown value! [%s] for key[%s]".format(value, key))
        return false
      }
    }
  }
}
