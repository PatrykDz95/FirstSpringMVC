<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        Student Registration Form!
    </title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

    <br><br>

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>
    Choose your country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>

    <br><br>

    Favorite Language:

    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageList}"/>

    <br><br>
    Operating Systems:
    Linux <form:checkbox path="operatingSystem" value="Linux"/>
    Windows <form:checkbox path="operatingSystem" value="Windows"/>
    Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>

</body>

</html>


