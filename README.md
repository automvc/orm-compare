
ORM Compare
=========
Which feature do you want?	

Test Evn : Local windows	
DB: MySQL (Version 5.6.24)	
Test point: Batch Insert;Select paging; Transaction(update and select).	

<table cellspacing="0" cellpadding="0">
  <col width="62" />
  <col width="69" />
  <col width="64" />
  <col width="69" span="2" />
  <col width="96" />
  <tr height="19">
    <td colspan="6" height="19" width="429"><div align="center">Batch Insert(unit: ms)</div></td>
  </tr>
  <tr height="19">
    <td height="19">　</td>
    <td>5k</td>
    <td>1w</td>
    <td>2w</td>
    <td>5w</td>
    <td>10w</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">880</td>
    <td align="right">720</td>
    <td align="right">620</td>
    <td align="right">1420</td>
    <td align="right">4700</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">359</td>
    <td align="right">358</td>
    <td align="right">484</td>
    <td align="right">1248</td>
    <td align="right">4000</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">348</td>
    <td align="right">297</td>
    <td align="right">546</td>
    <td align="right">1279</td>
    <td align="right">3470</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">529.00 </td>
    <td align="right">458.33 </td>
    <td align="right">550.00 </td>
    <td align="right">1315.67 </td>
    <td align="right">4056.67 </td>
  </tr>
  <tr height="10">
    <td height="10">　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1513</td>
    <td align="right">1092</td>
    <td align="right">1466</td>
    <td align="right">1700</td>
    <td>Not Support</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1045</td>
    <td align="right">577</td>
    <td align="right">812</td>
    <td align="right">1923</td>
    <td>Not Support</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1021</td>
    <td align="right">470</td>
    <td align="right">1600</td>
    <td align="right">1850</td>
    <td>Not Support</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">1193</td>
    <td align="right">713</td>
    <td align="right">1292.67 </td>
    <td align="right">1824.33 </td>
    <td>Exception</td>
  </tr>
</table>
<p>&nbsp;</p>
<table cellspacing="0" cellpadding="0">
  <col width="62" />
  <col width="69" />
  <col width="64" />
  <col width="69" span="2" />
  <col width="96" />
  <tr height="19">
    <td height="19" colspan="6">　　
    <div align="center">select(unit: ms)　　　</div></td>
  </tr>
  <tr height="19">
    <td width="62" height="19">　</td>
    <td width="69" align="right">20</td>
    <td width="64" align="right">50</td>
    <td width="69" align="right">100</td>
    <td width="69" align="right">200</td>
    <td width="96" align="right">500</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">21</td>
    <td align="right">20</td>
    <td align="right">46</td>
    <td align="right">51</td>
    <td align="right">67</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">16</td>
    <td align="right">78</td>
    <td align="right">32</td>
    <td align="right">16</td>
    <td align="right">61</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">15</td>
    <td align="right">78</td>
    <td align="right">79</td>
    <td align="right">48</td>
    <td align="right">44</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">17.33 </td>
    <td align="right">58.67 </td>
    <td align="right">52.33 </td>
    <td align="right">38.33 </td>
    <td align="right">57.33 </td>
  </tr>
  <tr height="9">
    <td height="9">　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">99</td>
    <td align="right">313</td>
    <td align="right">1795</td>
    <td align="right">2232</td>
    <td align="right">6160</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">423</td>
    <td align="right">655</td>
    <td align="right">1622</td>
    <td align="right">2310</td>
    <td align="right">6260</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">421</td>
    <td align="right">370</td>
    <td align="right">1221</td>
    <td align="right">2341</td>
    <td align="right">6230</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">314.33 </td>
    <td align="right">446.00 </td>
    <td align="right">1546.00 </td>
    <td align="right">2294.33 </td>
    <td align="right">6216.67 </td>
  </tr>
</table>
<p>&nbsp;</p>
<table cellspacing="0" cellpadding="0">
  <col width="62" />
  <col width="69" />
  <col width="64" />
  <col width="69" span="2" />
  <col width="96" />
  <tr height="19">
    <td colspan="6" height="19" width="429"><div align="center">Transaction(update and select) (unit: ms)</div></td>
  </tr>
  <tr height="19">
    <td height="19">　</td>
    <td align="right">20</td>
    <td align="right">50</td>
    <td align="right">100</td>
    <td align="right">200</td>
    <td align="right">500</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">1081</td>
    <td align="right">70</td>
    <td align="right">80</td>
    <td align="right">140</td>
    <td align="right">31600</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">1076</td>
    <td align="right">78</td>
    <td align="right">78</td>
    <td align="right">173</td>
    <td align="right">31240</td>
  </tr>
  <tr height="19">
    <td height="19">Bee</td>
    <td align="right">1110</td>
    <td align="right">62</td>
    <td align="right">94</td>
    <td align="right">171</td>
    <td align="right">31688</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">1089.00 </td>
    <td align="right">70.00 </td>
    <td align="right">84.00 </td>
    <td align="right">161.33 </td>
    <td align="right">31509.33 </td>
  </tr>
  <tr height="10">
    <td height="10">　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
    <td>　</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1170</td>
    <td align="right">31</td>
    <td align="right">79</td>
    <td align="right">146</td>
    <td align="right">32404</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1092</td>
    <td align="right">33</td>
    <td align="right">79</td>
    <td align="right">141</td>
    <td align="right">32891</td>
  </tr>
  <tr height="19">
    <td height="19">MyBatis</td>
    <td align="right">1170</td>
    <td align="right">41</td>
    <td align="right">81</td>
    <td align="right">151</td>
    <td align="right">31171</td>
  </tr>
  <tr height="19">
    <td height="19">(AVG)</td>
    <td align="right">1144</td>
    <td align="right">35</td>
    <td>79.67 </td>
    <td align="right">146.00 </td>
    <td align="right">32155.33 </td>
  </tr>
</table>


**Bee** is an ORM framework.   
**Bee** is an easy and high efficiency ORM framework. **Easy for Stronger.** 	 
**Coding Complexity is O(1),it means that Bee will do the Dao for you**.  

**Bee** see:  
https://github.com/automvc/bee  
