SELECT speaker_name, COUNT(*) AS session_count
FROM sessions
GROUP BY speaker_name
HAVING session_count > 1;
