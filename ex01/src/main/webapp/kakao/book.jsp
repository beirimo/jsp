<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<h1>도서검색</h1>
	<div class="row">
	<div class="col-6">
		<form name="frm">
		<div class="input-group">
			<input class="form-contrul">
			<button class="btn btn-info">검색</button>
		</div>
		
		</form>
	</div>
	
	</div>
	<div id="div_book" class="row"></div>
</div>
<script id="temp_book" type="x-handlebars-template">
	{{#each documents}}
		<div class="col-6 col-md-4 col-lg-2">
				<div class="card">
					<div class="card-body">
						<img src="{{thumbnail}}" width="90%">
					</div>
					<div class="card-footer">
					<div class="ellipsis">{{title}}</div>
					</div>
				</div>
		</div>
	{{/each}}
</script>
    <script>
    //도서 데이터 불러오기
    getData();
    function getData(){
       $.ajax({
          type:"get",
          url:"https://dapi.kakao.com/v3/search/book?target=title",
          headers:{"Authorization": "KakaoAK d1634623cd9a815bb4ce8af7168be659"},
          dataType:"json",
          data:{"query:":"query", page:1, size:6},
          success:function(data){
             console.log(data);
             const temp=Handlebars.compile($("#temp_book").html());
             $("#div_book").html(temp(data));
          }
       });
    }
    
    </script>