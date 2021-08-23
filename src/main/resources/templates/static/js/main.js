function fnMovePage(type) {
	if(type == 'intro') {

	} else if(type == 'login') {

	} else if(type == 'findMine') {
		location.href = '/findMine';
	}
}

function fnGoSearch() {
	var searchInput = document.querySelector("#searchInput").value;
	console.log(searchInput);
	alert('아직 준비중입니다만?');
}

var _PageMixins = [];
var app = new Vue({
    el: '#app',
    mixins: _PageMixins
});