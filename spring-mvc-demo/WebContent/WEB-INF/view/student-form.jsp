<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
<form:form action="processForm" modelAttribute="student">

First name: <form:input path ="firstName"/>
<br><br>
Last name: <form:input path ="lastName" />
<br><br>
<form:select path="country">

<%-- <form:option value="Brazil" label="Brazil"></form:option>
<form:option value="Australia" label="Australia"></form:option>
<form:option value="India" label="India"></form:option>
<form:option value="Japan" label="Japan"></form:option>
<form:option value="England" label="England"></form:option> --%>

<form:options items="${student.countryOptions}"/>

</form:select>
<br><br>

Favorite Language:

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>

<br><br>

Operating System:

Linux <form:checkbox path="operatingSystems" value="Linux"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>
MAC <form:checkbox path="operatingSystems" value="MAC"/>

<br><br>
<input type="submit" value="Submit" />
</form:form>

</body>
</html>