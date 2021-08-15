<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
<title>Student Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName"/>

<br><br>

Last Name: <form:input path="lastName"/>

<br><br>

Country Name: <form:select path="country">

<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="Italy" label="Italy"/>
<form:option value="India" label="India"/>

</form:select>

<br><br>

Favourite Language :
Java <form:radiobutton path="favouriteLanguage" value="Java"/>
JavaScript <form:radiobutton path="favouriteLanguage" value="JavaScript"/>
Python <form:radiobutton path="favouriteLanguage" value="Python"/>
C# <form:radiobutton path="favouriteLanguage" value="C#"/>

<br><br>

Operating Systems:
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Multics <form:checkbox path="operatingSystems" value="Multics"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>
Android <form:checkbox path="operatingSystems" value="Android"/>

<br><br>

<input type=submit value="SUBMIT"/>

</form:form>

</body>


</html>