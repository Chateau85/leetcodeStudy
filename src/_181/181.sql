select e.name from employee e join employee m on e.ManagerId = m.Id
where e.Salary > m.Salary
