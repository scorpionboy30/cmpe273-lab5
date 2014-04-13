$(":button").click(function() {
	var isbn = this.id;
	alert('About to report lost on ISBN ' + isbn);
	
	$.ajax({
	    type: 'PUT',
	    url: 'v1/books/'+isbn+'?status=lost',
	    dataType: 'json',
	    contentType: 'application/json; charset=utf-8',
		success: function() {
			$('#status'+isbn).html('lost');
			$('#'+isbn).attr("disabled",true);
		}
	});
});
