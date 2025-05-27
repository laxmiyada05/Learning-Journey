SELECT u.full_name, e.title AS event_title, f.rating, f.comments
FROM feedback f
JOIN users u ON f.user_id = u.user_id
JOIN events e ON f.event_id = e.event_id
WHERE f.rating < 3;
