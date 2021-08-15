<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Student's country is: ${student.country}

<br><br>

Favourite programming language: ${student.favouriteLanguage}

<br><br>

Operating systems:

<ul>

<c:forEach var="temp" items="${student.operatingSystems}">

<li>${temp}</li>

</c:forEach>

</ul>


</body>

</html>