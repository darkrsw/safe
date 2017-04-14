#!/bin/bash

#REPOPATH="/mnt/exp2/data/js/repos/repo-pack-$1"
#OUTPATH="/mnt/exp2/data/js/output/repo-pack-$1"

CONFPATH=$1
WORKPATH=$2

CLASSPATH="../target/scala-2.9.2/classes:../target/pack/lib/*"

java -cp "$CLASSPATH" -Xmx8g edu.lu.uni.serval.js.exp.safe.AlarmCollectorByHPC "$CLASSPATH" $CONFPATH $WORKPATH

#echo "SAFE alarm collection for repo-pack-$1" | mail -s "alarm collection completed $1" darkrsw@gmail.com
