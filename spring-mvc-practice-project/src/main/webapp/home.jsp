<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Board - Home</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
</head>
<body>

    <header>
        <h2>Job Board</h2>
        <nav>
            <a href="/home">Home</a>
            <a href="/jobsview">View Jobs</a>
        </nav>
    </header>

    <div class="center-content">
        <h1>Welcome to Job Board</h1>
        <a href="/addJob" class="add-job-btn">+ Add New Job</a>
    </div>

</body>
</html>