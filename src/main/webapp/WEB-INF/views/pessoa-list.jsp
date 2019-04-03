<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EXM01: Lista de Pessoas</title>
</head>
<body>
    <h1>EXM01: Lista de Pessoas</h1>
    <ol>
        <c:forEach var="pessoa" items="${galera}">
            <li value="${pessoa.id}">${pessoa.nome} ${pessoa.idade} anos</li>
            <form action="remove.html" method="POST">
                <input type="hidden" name="id" value="${pessoa.id}">
                <input type="submit" value="Excluir">
            </form>
        </c:forEach>
    </ol>
</body>
</html>