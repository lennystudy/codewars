#移除其中的元音
def disemvowel(str)
  str = str.gsub(/[aeiouAEIOU]/,'');
end


def disemvowel(str)
  str.delete('aeiouAEIOU')
end

puts disemvowel("This website is for losers LOL!")

