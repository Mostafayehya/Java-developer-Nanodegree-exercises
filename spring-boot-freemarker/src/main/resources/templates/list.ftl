<html>
<head>
    <title>Student List</title>
</head>
<meta charset="utf-8" />
<body>
<h3>Student Grade Table</h3>
<table>
    <tr>
        <th>Student ID</th>
        <th>Student Name</th>
        <th>Grade</th>
    </tr>
    <#list students as student>
        <tr>
            <td>${student.id}</td>
            <td>${student.studentName}</td>
            <td>${student.grade}</td>
        </tr>
    </#list>
</table>
</body>
</html>