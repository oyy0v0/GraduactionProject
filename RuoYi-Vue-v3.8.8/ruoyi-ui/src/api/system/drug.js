import request from '@/utils/request'

// 查询药品分类
//列表
export function listDrug(query) {
  return request({
    url: '/system/drug/list',
    method: 'get',
    params: query
  })
}

// 查询药品分类
//详细
export function getDrug(id) {
  return request({
    url: '/system/drug/' + id,
    method: 'get'
  })
}

// 新增药品分类

export function addDrug(data) {
  return request({
    url: '/system/drug',
    method: 'post',
    data: data
  })
}

// 修改药品分类

export function updateDrug(data) {
  return request({
    url: '/system/drug',
    method: 'put',
    data: data
  })
}

// 删除药品分类

export function delDrug(id) {
  return request({
    url: '/system/drug/' + id,
    method: 'delete'
  })
}
