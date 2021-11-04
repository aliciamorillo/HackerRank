# Given three integers (X, Y and Z) representing the three sides of a triangle, 
# identify whether the triangle is scalene, isosceles, or equilateral.

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
