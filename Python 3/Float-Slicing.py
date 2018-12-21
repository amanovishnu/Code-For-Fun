text = "X-DSPAM-Confidence:    0.8475"
# print(text)
pos = text.find(':')
print(float(text[pos+1:]))
