SELECT user_id, event_id, COUNT(*) AS times_registered
FROM registrations
GROUP BY user_id, event_id
HAVING times_registered > 1;
