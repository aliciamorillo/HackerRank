# Given two integers, X and Y, identify whether X < Y or X > Y or X = Y

read X
read Y

if [ "$X" -lt "$Y" ];
    then
        echo "X is less than Y";
elif [ "$X" -gt "$Y" ];
    then
        echo "X is greater than Y";
elif [ "$X" -ge "$Y" ];
    then
        echo "X is equal to Y";
fi
