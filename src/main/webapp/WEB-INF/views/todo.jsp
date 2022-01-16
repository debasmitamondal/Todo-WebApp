<%@ include file="../common/header.jspf"%>
<%@ include file="../common/nav.jspf"%>
	

<div class="container">
		<H1>My Todo List</H1>
	<ol>
	 <c:forEach items="${todos}" var="todo">
	    <li>${todo.name} &nbsp; ${todo.category} <a href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></li>
	 </c:forEach>
	</ol>

	<form action="/todo.do" method="post">
	Description: <input type="text" name="todo"/>
	Category:<input type="text" name="category"/>  <input type="submit" value="Add"/>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>