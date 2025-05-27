SELECT u.user_id, u.full_name, u.email
FROM users u
LEFT JOIN registrations r ON u.user_id = r.user_id
WHERE r.registration_id IS NULL
   OR r.registration_date < CURDATE() - INTERVAL 90 DAY;
