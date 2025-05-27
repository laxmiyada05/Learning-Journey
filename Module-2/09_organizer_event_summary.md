SELECT u.full_name, e.status, COUNT(*) AS event_count
FROM events e
JOIN users u ON e.organizer_id = u.user_id
GROUP BY u.full_name, e.status;
