SELECT Firstname, Lastname, City, State
FROM person p left join address a on p.PersonId = a.PersonId;