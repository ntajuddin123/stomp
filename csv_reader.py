import sys
import csv
import xml.etree.cElementTree as ET

# usage: python csv_reader.py filename.csv

f = open(sys.argv[1], 'rU')

try:
    reader = csv.reader(f)

    # extract xml tags from first line of csv file
    header = reader.next()
    tags = []
    for tag in header:
	if tag:
	    tags.append(tag.strip())
    tag_count = len(tags)

    # generate xml content from remaining lines of csv
    root = ET.Element("stomp")
    for meal in reader:
	mealTree = ET.SubElement(root, "meal")
	for i in range(0, tag_count):
	    content = unicode(meal[i], errors='ignore')
	    ET.SubElement(mealTree, tags[i]).text = content
    tree = ET.ElementTree(root)

    tree.write("dmp.xml")
    print "File saved as dmp.xml"
    
    #  ET.dump(root)

finally:
    f.close()
