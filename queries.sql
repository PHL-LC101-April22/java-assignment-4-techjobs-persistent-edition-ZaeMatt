-- Part 1: Test it with SQL

id int PK,
employer VARCHAR(255)
name VARCHAR(255)
skills VARCHAR(255)
--Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "Saint Louis City";
-- Part 3: Test it with SQL
DROP TABLE job;

-- Part 4: Test it with SQL
SELECT DISTINCT name, description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id
ORDER BY name;