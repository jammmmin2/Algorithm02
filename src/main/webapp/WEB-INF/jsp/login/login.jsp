<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>로그인</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h2>로그인</h2>
<form id="loginForm">
  아이디: <input type="text" name="userId" id="userId"><br>
  비밀번호: <input type="password" name="password" id="password"><br>
  <button type="button" onclick="login()">로그인</button>
</form>

<script>
  function login() {
    $.ajax({
      url: 'login',
      method: 'POST',
      data: {
        userId: $('#userId').val(),
        password: $('#password').val()
      },
      success: function (result) {
        alert(result);
      }
    });
  }
</script>
</body>
</html>