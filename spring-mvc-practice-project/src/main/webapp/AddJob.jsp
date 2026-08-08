<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Board - Add Job</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}style.css">
</head>
<body>

    <header>
        <h2>Job Board</h2>
        <nav>
            <a href="/">Home</a>
            <a href="/jobs">View Jobs</a>
        </nav>
    </header>

    <div class="form-container">
        <h1>Add New Job</h1>
        <p class="subtitle">Fill in the details below to post a new job opening</p>

        <form action="/addJob" method="post">

            <label for="title">Job Title</label>
            <input type="text" id="title" name="title" placeholder="e.g. Java Developer" required>

            <label for="company">Company Name</label>
            <input type="text" id="company" name="company" placeholder="e.g. Infosys" required>

            <label for="location">Location</label>
            <input type="text" id="location" name="location" placeholder="e.g. Pune" required>

            <label for="salary">Salary (per annum)</label>
            <input type="number" id="salary" name="salary" placeholder="e.g. 500000" required>

            <label for="experience">Experience Required (years)</label>
            <input type="number" id="experience" name="experience" placeholder="e.g. 2" required>

            <label for="description">Job Description</label>
            <textarea id="description" name="description" placeholder="Brief description of the role" required></textarea>

            <button type="submit">Submit Job</button>

        </form>
    </div>

</body>
</html>