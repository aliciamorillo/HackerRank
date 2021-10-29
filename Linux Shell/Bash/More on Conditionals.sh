read x
read y
read z

if ((($x == $y) && ($y == $z) && ($x == $y)));
    then
        echo "EQUILATERAL"
elif ((($x == $y) || ($x == $z) || ($y == $z)));
    then
        echo "ISOSCELES"
else
        echo "SCALENE"
fi