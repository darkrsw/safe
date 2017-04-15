#!/bin/bash

#NJOBS=25

for i in {1..24} # no support for substitution
do
    oarsub -n jss-$i -O /work/users/dkim/exp/js-study/joblogs/jss-${i}-%jobid%.stdout \
        -E /work/users/dkim/exp/js-study/joblogs/jss-${i}-%jobid%.stderr \
	    -l nodes=1/core=4,walltime=120:00:00 --notify "mail:darkrsw@gmail.com" \
	    "/work/users/dkim/exp/js-study/script/hpc-collect.sh"
    
    echo "job ${i} submitted."
done
