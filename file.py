

def getThreeMostRepeatedWords(paragraph):

  words=paragraph.split()

  if(len(words)<3):
     return "Error : paragraph must have at least 3 words."

  words_count_hashmap={}
  for word in words:
    if( word not in words_count_hashmap):
       words_count_hashmap[word]=1


    else:
        words_count_hashmap[word]+=1

  max1=0
  max2=0
  max3=0

  word1=words[0]
  word2=words[1]
  word_3=words[2]

  for word, count in words_count_hashmap.items():
        if count > max1:
            max3 = max2
            max2 = max1
            max1 = count
            word3 = word2
            word2 = word1
            word1 = word
        elif count > max2:
            max3 = max2
            max2 = count
            word3 = word2
            word2 = word
        elif count > max3:
            max3 = count
            word3 = word

  return [word1, word2, word3]




print(getThreeMostRepeatedWords("We’re building tomorrow—and beyond. BCG X brings together over 3,000 of the best tech, design, and entrepreneurial minds to create businesses, products, and services that will change the world. Working in collaboration with BCG’s deep industry and functional experts, our diverse teams help CEOs and world leaders create powerful solutions for a bigger, brighter future."))
