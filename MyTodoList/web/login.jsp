<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!--<link rel="stylesheet" href="login.css">-->
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Pacifico&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Protest+Riot&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Source+Code+Pro:ital,wght@0,200..900;1,200..900&display=swap');

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: "Exo 2", sans-serif;
}

body {
    margin: 0;
    height: 100vh;
    overflow: hidden;  /* Prevent scrolling */
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #fff;  /* Fallback color */
    position: relative;
}

.background-container {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: -1; /* Ensures it's behind other elements */
}

.background-image {
    width: 100%;
    height: 100%;
    object-fit: cover; /* Cover the entire area */
    opacity: 0.5;
}

.content {
    position: relative;
    z-index: 1; /* Makes sure it stays above the background */
    display: flex;
    flex-direction: column;
    align-items: center;
}

h2 {
    margin-bottom: 20px;
}

.con {
    background-color: rgba(255, 255, 255, 0.9); /* Slight background to make form readable */
    padding: 34px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);
    max-width: 400px;
    text-align: center;
    
    z-index: 1;
}

label {
    font-size: 20px;
    font-family: "Source Code Pro", monospace;
    display: block;
    margin: 10px 0;
}

input {
    width: 100%;
    height: 40px;
    border: 2px solid black;
    border-radius: 5px;
    font-size: 20px;
    margin-top: 10px;
}

.frm {
    display: flex;
    flex-direction: column;
    align-items: center;
}

#submit {
    padding: 4px 35px;
    font-size: 20px;
    background-color: blue;
    font-family: "Pacifico", cursive;
    color: white;
    margin-top: 20px;
    border: 2px solid black;
    border-radius: 5px;
    cursor: pointer;
}

    </style>
</head>
<body>
    <div class="background-container">
        <img src="i4.jpg" alt="stanford" class="background-image"/>
    </div>
    <div class="content">
        <h2>Login</h2>
        <div class="con">
            <!-- Display error message if login fails -->
            <form action="LoginServlet" method="post" class="frm">
                <label>Username :</label>
                <input type="text" name="username" required><br>
                <label>Password :</label>
                <input type="password" name="password" required><br>
                <button type="submit" value="Login" id="submit">Login</button>
            </form>
            <div>
                <h3>
                    <% if (request.getParameter("error") != null) { %>
                        <p style="color: red;">Invalid username or password.</p>
                    <% } %>
                </h3>
            </div>
        </div>
    </div>
</body>
</html>
