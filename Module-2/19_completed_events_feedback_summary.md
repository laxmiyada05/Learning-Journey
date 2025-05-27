SELECT e.title, COUNT(DISTINCT r.registration_id) AS registrations,
       ROUND(AVG(f.rating), 2) AS avg_rating
FROM events e
LEFT JOIN registrations r ON e.event_id = r.event_id
LEFT JOIN feedback f ON e.event_id = f.event_id
WHERE e.status = 'completed'
GROUP BY e.event_id;
