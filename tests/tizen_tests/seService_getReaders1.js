/*******************************************************************************
    Copyright (c) 2013, S-Core.
    All rights reserved.

    Use is subject to license terms.

    This distribution may include materials developed by third parties.
 ******************************************************************************/
var __result1, __result2;
  function success(readers) {
    __result1 = readers[0].isPresent;
  }
  function error(err) {
    __result2 = err.name;
  }
  tizen.seService.getReaders(success, error);



var __expect1 = true
var __expect2 = "UnknownError"