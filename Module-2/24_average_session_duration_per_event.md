SELECT event_id,
       ROUND(AVG(TIMESTAMPDIFF(MINUTE, start_time, end_time)), 2) AS avg_duration_minutes
FROM sessions
GROUP BY event_id;
