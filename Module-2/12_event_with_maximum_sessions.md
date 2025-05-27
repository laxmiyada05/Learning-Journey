SELECT event_id, COUNT(*) AS session_count
FROM sessions
GROUP BY event_id
HAVING session_count = (
  SELECT MAX(session_count) FROM (
    SELECT COUNT(*) AS session_count
    FROM sessions
    GROUP BY event_id
  ) AS sub
);
