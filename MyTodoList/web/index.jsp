<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
      <!--<link rel="stylesheet" href="index.css">-->
      <style>
          @import url('https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Pacifico&display=swap');
/* @import url('https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100..900&family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap'); */
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
/*    display: flex;
    justify-content: center;*/
   
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
    opacity: 0.6;
}

.content {
    position: relative;
    z-index: 1; /* Makes sure it stays above the background */
/*    display: flex;
    flex-direction: column;
    align-items: center;*/
}

h2{
    
    text-align: center;
    font-family: "Source Code Pro", monospace;
    font-size: 40px;
}
h3{
    text-align: center;
}
a{
  font-family: "Roboto Slab", serif;  
  
}
      </style>
</head>

<body>
    <div class="background-container">
        <img src="i1.jpg" alt="stanford" class="background-image"/>
    </div>
    <div class="con">
    <h2>Welcome to Todo App</h2>
    <h3><a href="register.jsp" class="my">Register</a> | <a href="login.jsp" class="my">Login</a> <h3>
    </div>
</body>
</html>
