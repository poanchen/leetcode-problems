// Problem link: https://leetcode.com/problems/big-countries/description/
// Status: Accepted

SELECT name, population, area
FROM World
WHERE area > 3000000 OR population > 25000000;
