SELECT e.event_id, e.title, e.start_date, e.city
FROM events e
JOIN registrations r ON e.event_id = r.event_id
JOIN users u ON r.user_id = u.user_id
WHERE e.start_date > NOW()
  AND e.city = u.city
  AND r.user_id = 1  -- Replace with the desired user_id
ORDER BY e.start_date;
