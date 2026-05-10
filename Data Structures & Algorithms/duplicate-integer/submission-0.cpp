class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> s;
        for (int x : nums)
            s.insert(x);
        
        if (s.size() == nums.size())
            return false;

        return true;
    }
};