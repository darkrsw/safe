#!/bin/bash

#REPOPATH="/mnt/exp2/data/js/repos/repo-pack-$1"
#OUTPATH="/mnt/exp2/data/js/output/repo-pack-$1"

CONFPATH="/work/users/dkim/exp/js-study/script/jsalarm.conf"
WORKPATH="/scratch/users/dkim/exp/js-study/repos/repo-pack-13/"


CLASSPATH="/work/users/dkim/exp/js-study/safe/target/scala-2.9.3/classes:/work/users/dkim/exp/js-study/lib/*"

java -cp "$CLASSPATH" -Xmx8g edu.lu.uni.serval.js.exp.safe.AlarmCollectorByHPC "$CLASSPATH" $CONFPATH $WORKPATH

#echo "SAFE alarm collection for repo-pack-$1" | mail -s "alarm collection completed $1" darkrsw@gmail.com
