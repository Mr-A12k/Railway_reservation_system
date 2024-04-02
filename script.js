document.getElementById("login-form").addEventListener("submit", function(event) {
    event.preventDefault();
    // Perform login validation here
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    // Example validation, replace with actual validation logic
    if (username === "admin" && password === "password") {
      // Successful login, redirect or perform necessary action
      alert("Login successful!");
    } else {
      // Failed login, show error message
      alert("Invalid username or password. Please try again.");
    }
  });