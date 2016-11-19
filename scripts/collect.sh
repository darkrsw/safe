#!/bin/bash

REPOPATH="/mnt/exp2/data/js/repos/repo-pack-$1"
OUTPATH="/mnt/exp2/data/js/output/repo-pack-$1"

CLASSPATH="../target/scala-2.9.2/classes:../target/pack/lib/*"

java -cp "$CLASSPATH" -Xmx32g edu.lu.uni.serval.js.exp.safe.AlarmCollectorByPack $REPOPATH $OUTPATH $CLASSPATH

echo "SAFE alarm collection for repo-pack-$1" | mail -s "alarm collection completed $1" darkrsw@gmail.com
