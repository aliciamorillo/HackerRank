#Given N integers, compute their average, rounded to three decimal places.

sum = 0
read N

for i in $(seq 1 $N); do
    read number
    sum=$(( $sum + $number ))
done

printf "%.3f" `echo "$sum / $N" | bc -l`
