$ ->
  getDate = ->
    $('#dateTime').html moment().format 'MMMM D, YYYY dddd h:mm:ss a'

    setTimeout (->
      getDate()
      return
    ), 1000

  getDate()
