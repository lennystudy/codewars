def find_nb(m)
    # your code
 i = 1;
 sum = 0;
 begin
 	sum = sum + i**3;
 	i = i + 1;
 end until sum >= m
 	
 return sum>m ? -1 : (i-1);
end

def find_nb(m)
  n = ((m * 4)**0.25).to_i
  (n**2) * ((n + 1)**2) / 4 == m ? n : -1
end


puts find_nb(91716553919377)

