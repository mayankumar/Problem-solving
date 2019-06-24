fun(vector<int> ans,treenode *root)
{
	queue<pair<treenode*,int>> q;
	map<int,int> m;
	map<int, int>::iterator itr;
	if(root==NULL)
		return ans;
	p.first=root;
	p.second=0;
	q.push(p);
	while(!q.empty())
	{
		temp=q.front();
		q.pop();
		if(temp.first->left)
		{
			p.first=temp.first->left;
			p.second=temp.second-1;
		}
		if(temp.first->right)
		{
			p.first=temp.first->right;
			p.second=temp.second+1;
		}
		itr=m.find(temp.second);
		if(itr==m.end())
			m.insert(pair<int,int>(temp.second,temp.first->val))
	}

	for(itr=m.begin();itr!-m.end();itr++)
		ams.pushback(itr->second);
	return ans;
}