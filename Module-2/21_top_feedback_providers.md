SELECT u.full_name, COUNT(f.feedback_id) AS feedback_count
FROM feedback f
JOIN users u ON f.user_id = u.user_id
GROUP BY u.user_id
ORDER BY feedback_count DESC
LIMIT 5;
