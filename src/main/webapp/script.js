$(function() {

  $("#send").attr("disabled", true);
  var ws = new WebSocket("ws://localhost:8080/websocket/broadcast");

  ws.onopen = function() {
    $("#send").attr("disabled", false)
  }

  ws.onmessage = function(receive) {
    $("#receive").text(receive.data);
  }

  $("#send").on("click", function() {
    var text = $("#message").val()
    ws.send(text)
  })

})
