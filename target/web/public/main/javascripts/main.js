(function() {
  $(function() {
    var getDate;
    getDate = function() {
      $('#dateTime').html(moment().format('MMMM D, YYYY dddd h:mm:ss a'));
      return setTimeout((function() {
        getDate();
      }), 1000);
    };
    return getDate();
  });

}).call(this);

//# sourceMappingURL=main.js.map
