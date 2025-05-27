SELECT DISTINCT e.event_id, e.title
FROM events e
JOIN registrations r ON e.event_id = r.event_id
LEFT JOIN feedback f ON e.event_id = f.event_id
WHERE f.event_id IS NULL;
