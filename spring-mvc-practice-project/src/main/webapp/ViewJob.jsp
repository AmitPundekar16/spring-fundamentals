<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Board - View Jobs</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}style.css">
</head>
<body>

    <header>
        <h2>Job Board</h2>
        <nav>
            <a href="/">Home</a>
            <a href="/viewjobs">View Jobs</a>
        </nav>
    </header>

    <div class="job-list-container">
        <h1>Available Jobs</h1>

        <table>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Company</th>
                    <th>Location</th>
                    <th>Salary</th>
                    <th>Experience</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="job" items="${jobs}">
                    <tr>
                        <td>${job.title}</td>
                        <td>${job.company}</td>
                        <td>${job.location}</td>
                        <td>${job.salary}</td>
                        <td>${job.experience} yrs</td>
                        <td>${job.description}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>