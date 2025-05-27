async function submitRegistration(data) {
  try {
    const res = await fetch("https://api.example.com/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    });
    const result = await res.json();
    alert("Registration success!");
  } catch (err) {
    alert("Failed to register.");
  }
}
