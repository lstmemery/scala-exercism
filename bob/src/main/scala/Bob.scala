/**
  * Created by deadhand on 07/05/17.
  */
class Bob {
  def hey(s: String): String = {
    if (s.trim == "") "Fine. Be that way!"
    else if (s.toUpperCase() == s && s.toLowerCase != s) "Whoa, chill out!"
    else if (s.last == '?') "Sure."
    else "Whatever."
  }

}
