<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="row justify-content-center">
	<div class="col-8 col-md-6 col-lg-4">
		<h1>login</h1>
		<div class="card">
			<div class="card-body">
				<form name="frm" method="post">
					<div class="input-group mb-2">
						<span class="input-group-text">아이디</span>
						 <input name="uid"class="form-control">
					</div>
					<div class="input-group mb-2">
						<span class="input-group-text">비밀번호</span> 
						<input name="upass" type="password" class="form-control">
					</div>
					<button class="btn btn-primary w-100">로그인</button>
				</form>
			</div>
		</div>
	</div>
</div>

<script>
	$(frm).on("submit", function(e){
		e.preventDefault();
		const uid=$(frm.uid).val();
		const upass=$(frm.upass).val();
		if(uid==""){
			alert("아이디를 입력하세요! ");
		}else if(upass==""){
			alert("비밀번호를 입력하세요!");
			$(frm.upass).focus();
		}else{
			//로그인 체크
			$.ajax({
				type:"post",
				url:"/user/login",
				data:{uid,upass},
				success:function(data){
				 	if(data=0){
				 		alert("아이디가 존재하지않ㅅ브니다.");
				 		$(frm.uid).val("");
				 		$(frm.uid).focus();
				 	}else if(data==2){
				 		alert("비밀번호가 일치하지 않ㅅ브니다.");
				 		$(frm.upass).val("");
				 		$(frm.upass).focus();
				 	}else{
				 		alert("어서와 로그인은 처음이지?")
				 		location.href="/";
				 	}
				}
				
			})
		}
	});
</script>
